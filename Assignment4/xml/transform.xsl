<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <课程成绩列表>
            <xsl:apply-templates />
        </课程成绩列表>
    </xsl:template>
    <xsl:key name="groupByCourseId" match="课程成绩" use="concat(@课程编号,'+',@成绩性质)"/>


    <xsl:template match="学生列表">
        <xsl:apply-templates
                select="//课程成绩[generate-id(.)=generate-id(key('groupByCourseId',concat(@课程编号,'+',@成绩性质))[1])]"
                mode="inGroup" />
    </xsl:template>

    <xsl:template match="//课程成绩" mode="inGroup">
        <课程成绩>
            <xsl:attribute name="课程编号"><xsl:value-of select="@课程编号" /></xsl:attribute>
            <xsl:attribute name="成绩性质"><xsl:value-of select="@成绩性质" /></xsl:attribute>

            <xsl:for-each select="key('groupByCourseId', concat(@课程编号,'+',@成绩性质))">
                <xsl:sort select="/成绩/得分"/>
                <成绩>
                    <学号>
                        <xsl:value-of select="/成绩/学号" />
                    </学号>
                    <得分>
                        <xsl:value-of select="/成绩/得分" />
                    </得分>
                </成绩>

            </xsl:for-each>
        </课程成绩>
    </xsl:template>

</xsl:stylesheet>