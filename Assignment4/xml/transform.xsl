<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output indent="yes"/>

    <xsl:key name="course" match="*[name()='课程成绩']" use="concat(@课程编号,'+',@成绩性质)"/>
    <xsl:template match="/*[name()='学生列表']">
        <xsl:element name="课程成绩列表" >
            <!--xsl:attribute name="xmlns">http://jw.nju.edu.cn/schema</xsl:attribute>
            <xsl:attribute name="xmlns:xsi">http://www.w3.org/2001/XMLSchema-instance/</xsl:attribute>
            <xsl:attribute name="xsi:schemaLocation">http://jw.nju.edu.cn/schema ScoreList.xsd</xsl:attribute-->
            <xsl:apply-templates
                    select="//*[name()='课程成绩'][generate-id(.)=generate-id(key('course',concat(@课程编号,'+',@成绩性质)))]"
                    mode="inGroup" />
        </xsl:element>
    </xsl:template>

    <xsl:template match="//*[name()='课程成绩']" mode="inGroup">
        <课程成绩>
            <xsl:attribute name="课程编号"><xsl:value-of select="@课程编号" /></xsl:attribute>
            <xsl:attribute name="成绩性质"><xsl:value-of select="@成绩性质" /></xsl:attribute>

            <xsl:for-each select="key('course', concat(@课程编号,'+',@成绩性质))">
                <xsl:sort select="./*[name()='成绩']/*[name()='得分']" data-type="number" order="ascending"/>
                <xsl:element name="成绩">
                    <xsl:element name="学号">
                        <xsl:value-of select="./*[name()='成绩']/*[name()='学号']" />
                    </xsl:element>
                    <xsl:element name="得分">
                        <xsl:value-of select="./*[name()='成绩']/*[name()='得分']" />
                    </xsl:element>
                </xsl:element>

            </xsl:for-each>
        </课程成绩>
    </xsl:template>


</xsl:stylesheet>