<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" > 
<xsl:key name='group' match='/employees/employee' use='department'/>		

<xsl:template match="/employees">
	<html>
		<head>
			<title><xsl:text>Співробітники: групування даних</xsl:text></title>
		</head>
		<body bgcolor = '#cc1'>
			<xsl:apply-templates select="employee[generate-id() = generate-id(key('group',department)[1])]"/>
		</body>
	</html>
</xsl:template>

<xsl:template match="employee">
	<div  class='layer'>
		<style>
			.layer {
			padding: 20px; }
		</style>
		
		<h1><b><xsl:value-of select="department"/></b></h1>

		<xsl:for-each select="key('group',department)">
			<i><xsl:value-of select="fullname"/></i><br/>
		</xsl:for-each>
	</div>
</xsl:template>
				
</xsl:stylesheet>