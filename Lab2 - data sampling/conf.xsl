<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <HTML>
            <title>
                <xsl:text>Lab2: data sampling</xsl:text>
            </title>

            <xsl:param name="min"/>
            <body>
                <font color='yellow'>Header</font>
                <table border='1'>
                    <tr>
                        <th>ПІБ</th>
                        <th>Зарплата</th>
                    </tr>

                    <xsl:variable name="itemsWhereSomeCondition" select="employees/employee[@salary>$min]"/>
                    <xsl:variable name="count" select="count($itemsWhereSomeCondition)"/>

                    <xsl:choose>
                        <xsl:when test="$count= 0">
                            <td>
                                <b>
                                    <xsl:text>No employees matching conditions found</xsl:text>
                                </b>
                            </td>
                        </xsl:when>
                        <xsl:otherwise>
                            <xsl:for-each select='employees/employee[@salary>$min]'>
                                <tr>
                                    <td>
                                        <i>
                                            <font color='black'>
                                                <xsl:value-of select='@fullname'/>
                                            </font>
                                        </i>
                                    </td>
                                    <td>
                                        <xsl:value-of select='@salary'/>
                                    </td>
                                </tr>
                            </xsl:for-each>
                        </xsl:otherwise>
                    </xsl:choose>
                </table>
            </body>
        </HTML>
    </xsl:template>
</xsl:stylesheet>