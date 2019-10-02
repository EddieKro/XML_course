<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match ="/"><!--push processing-->
	<HTML>
		<title>
			<xsl:text>ЗАРПЛАТИ СПІВРОБІТНИКІВ: Форсована обробка</xsl:text>
		</title>
		<body>
			<font color = "red"><b>ЗАРПЛАТИ СПІВРОБІТНИКІВ</b></font>
			<xsl:apply-templates/>
		</body>
	</HTML>
</xsl:template>

<xsl:template match="//employees">
	<HTML>
	<body>
	<table border="1">
	<tr>
	<font color='teal'>
		<td>ПІБ</td>
		<td>Підрозділ</td>
		<td>Зарплата</td>
		<td>E-mail</td>
		<td>WWW</td>
	</font>
	</tr>
	<xsl:apply-templates select='employee'>
		<xsl:sort select='fullname'/>
	</xsl:apply-templates>
			
	</table>
	</body>
	</HTML>
</xsl:template>

<xsl:template match="employee">
	<tr>
	<td><i><font color='black'><xsl:apply-templates select='fullname'/></font></i></td>
	<td><xsl:apply-templates select='department'/></td>
	<td><xsl:apply-templates select='salary'/></td>
	<td><a href="{concat('mailto:',email)}"> e-mail</a></td>
	<td><a><xsl:attribute name="href">
		<xsl:value-of select="webpage"/>
		</xsl:attribute>personal webpage</a></td>
	</tr>
</xsl:template>

</xsl:stylesheet>