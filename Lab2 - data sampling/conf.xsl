<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml" indent="yes"/>
    <xsl:template match="/">

        <xsl:param name="min"/>

        <xsl:variable name="itemsWhereSomeCondition" select="employees/employee[@salary>$min]"/>
        <xsl:variable name="count" select="count($itemsWhereSomeCondition)"/>

        <xsl:choose>
            <xsl:when test="$count= 0">
                <xsl:copy>
                    <xsl:text>No employees matching conditions found</xsl:text><!-- append-->
                </xsl:copy>
            </xsl:when>
            <xsl:otherwise>
                <xsl:copy>
                    <xsl:element name="employees">
                        <xsl:for-each select='employees/employee[@salary>$min]'>
                            <xsl:element name="{name()}">
                                <xsl:attribute name="fullname">
                                    <xsl:value-of select="@fullname"/>
                                </xsl:attribute>
                                <xsl:attribute name="salary">
                                    <xsl:value-of select="@salary"/>
                                </xsl:attribute>
                            </xsl:element>
                        </xsl:for-each>
                    </xsl:element>

                </xsl:copy>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>
</xsl:stylesheet>