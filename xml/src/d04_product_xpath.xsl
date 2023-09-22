<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : d03_product.xsl
    Created on : September 15, 2023, 11:32 AM
    Author     : THUYLM
    Description:
        Purpose of transformation document d03_product.xml => product.html
        In ra cac san pham thuoc nhom [FOOD]
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <html>
            <head>
                <title>san-pham-FOOD</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"  rel="stylesheet" />                     
            </head>
            <body>
                <div class="container">
                    <h2>Product List <small>(-- Food ---)</small> </h2>
                    <hr/>
                    <div>
                        <xsl:apply-templates />
                    </div>
                </div>
            </body>
        </html>
    </xsl:template>
    
    <!-- style for <store> element-->
    <xsl:template match="store" >
        <p>
            <span style="color: red" >
                <xsl:value-of select="store-name" /> 
            </span>
            <br/>
            <span style="color: green" >
                <xsl:value-of select="store-adress" /> 
            </span>
            
            
            <table class="table table-hover table-striped">
                <thead>
                    <tr>
                        <th>no.</th>
                        <th>id</th>
                        <th>name</th>
                        <th>price</th>
                        <th>q.o.h</th>
                        <th>status</th>
                    </tr>
                </thead>
                <tbody>
                    <xsl:for-each select="product[cat='Food']">
                        <xsl:sort select="price" data-type="number" order="descending"/>
                        <tr>
                            <td> 
                                <!-- <xsl:value-of select="position()" />-->
                                <xsl:number value="position()" />
                            </td>
                            <td> 
                                <xsl:value-of select="@id" />
                            </td>
                            <td> 
                                <xsl:value-of select="name" />
                            </td>                                                 
                            <td style="color:red; text-align:right;padding-right:40px;">  
                                <xsl:value-of select="price" /> 
                            </td>
                            <td style="text-align:right;padding-right:40px;">  
                                <xsl:value-of select="qoh" /> 
                            </td>
                            <td>
                                <xsl:value-of select="@status" />
                            </td>  
                        </tr>
                    </xsl:for-each>
                </tbody>
            </table>
        </p>
    </xsl:template>
    
</xsl:stylesheet>
