<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	xmlns:msxsl="urn:schemas-microsoft-com:xslt" exclude-result-prefixes="msxsl">
	<xsl:output method="xml" indent="yes"/>      
	<xsl:key name='group' match='employee' use='department'/>
			<xsl:template match="/employees">
				<table border="1">
					<tr>
					<th>Department</th>
					<th>Fullname</th>
					</tr>
				</table>
					<xsl:apply-templates select="employee[generate-id() = generate-id(key('group',department)[1])]"/>

			</xsl:template>
			
			<xsl:template match="employee">
			
			<h1><b><xsl:value-of select="department"/></b></h1>
				<tr>
				<xsl:for-each select="key('group',department)">
					<td>	<xsl:value-of select="fullname"/>
					</td><br/>
						</xsl:for-each>
				</tr>
				</xsl:template>
				



	
</xsl:stylesheet>