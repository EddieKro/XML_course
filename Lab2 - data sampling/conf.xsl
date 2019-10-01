<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml" indent="yes"/>
    <xsl:template match="/">

        <xsl:param name="min"/>

        <xsl:variable name="itemsWhereSomeCondition" select="employees/employee[@salary>$min]"/>
        <xsl:variable name="count" select="count($itemsWhereSomeCondition)"/>

        <xsl:choose>
            <xsl:when test="$count= 0">
                <xsl:copy>
                    <xsl:element name="message">
                        <xsl:text>No employees with salary more than </xsl:text>
                        <xsl:value-of select="$min"/>
                        <xsl:text> found</xsl:text>
                    </xsl:element>
                </xsl:copy>
            </xsl:when>
            <xsl:otherwise>
                <xsl:element name="employees">
                    <xsl:copy>
                        <xsl:copy-of select="employees/employee[@salary>$min]"/>
                    </xsl:copy>
                </xsl:element>

            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>
</xsl:stylesheet>

