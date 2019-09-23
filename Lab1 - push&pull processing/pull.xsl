<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/"><!--push processing-->
	<HTML>
		<title>
			<xsl:text>ЗАРПЛАТИ СПІВРОБІТНИКІВ: Витягаюча обробка</xsl:text>
		</title>
		<body>
			<font color = "red"><b>ЗАРПЛАТИ СПІВРОБІТНИКІВ</b></font>
			<table border="1">
			<tr>
			<font color='teal'>
				<th>ПІБ</th>
				<th>Підрозділ</th>
				<th>Зарплата</th>
				<th>E-mail</th>
				<th>WWW</th>
			</font>
			</tr>
			
		<xsl:for-each select='employees/employee'>
		<xsl:sort select='fullname'/>
		<tr>
			<td><i><font color='black'><xsl:value-of select='fullname'/></font></i></td>
			<td><xsl:value-of select='department'/></td>
			<td><xsl:value-of select='salary'/></td>
			<td><a href="{concat('mailto:',email)}"> e-mail</a></td>
			<td><a><xsl:attribute name="href">
				<xsl:value-of select="webpage"/>
				</xsl:attribute>personal webpage</a></td>
		</tr>
	
	</xsl:for-each>	
	</table>

</body>
</HTML>
</xsl:template>
	
</xsl:stylesheet>