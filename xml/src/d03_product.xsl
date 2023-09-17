<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : d03_product.xsl
    Created on : September 15, 2023, 11:32 AM
    Author     : THUYLM
    Description:
        Purpose of transformation document d03_product.xml => product.html
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
        <xsl:apply-templates />
    </xsl:template>
    
    
    <!-- style for <store-name> element-->
    <xsl:template match="store-name" >
        <p style="color: red">
            <xsl:value-of select="." />
        </p>
    </xsl:template>
    
    <!-- style for <store-address> element-->
    <xsl:template match="store-adress" >
        <p style="color: green">
            <xsl:value-of select="." />
        </p>
    </xsl:template>
</xsl:stylesheet>
