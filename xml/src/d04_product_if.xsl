<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : d03_product.xsl
    Created on : September 15, 2023, 11:32 AM
    Author     : THUYLM
    Description:
        Purpose of transformation document d03_product.xml => product.html
        cac san pham co status = false => in mau do
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <html>
            <head>
                <title>san-pham</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"  rel="stylesheet" />                     
            </head>
            <body>
                <div class="container">
                    <h2>Product List</h2>
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
                        <th>quality on hand</th>
                        <th>category</th>
                        <th>status</th>
                    </tr>
                </thead>
                <tbody>
                    <xsl:for-each select="product">
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
                            <td>  
                                <xsl:value-of select="price" /> 
                            </td>
                            <td>  
                                <xsl:value-of select="qoh" /> 
                            </td>
                            <td>   
                                <xsl:value-of select="cat" />
                            </td>
                            
                            <xsl:if test="@status = 'false'">
                                <td style="color:orange; font-weight:bold;">   
                                    <xsl:value-of select="@status" />
                                </td>                                
                            </xsl:if>
                            <xsl:if test="@status = 'true'">
                                <td>   
                                    <xsl:value-of select="@status" />
                                </td>
                            </xsl:if>
                        </tr>
                    </xsl:for-each>
                </tbody>
            </table>
        </p>
    </xsl:template>
    
</xsl:stylesheet>
