1.项目结构
./xml
放置schemas和生成的结果xml文档，其中
2.xml是DOM作业中生成studentList，
3.xml是将2.xml通过transform.xsl转化得到的scoreList，
4.xml是sax生成的结果文档

./src
放置生成xml的代码

2.代码概要
XSLT：
编写transform.xsl脚本文件，使用key得到一门课程的一种成绩性质的节点集，在每一个节点集中按照得分进行升序排序，最终由src的main函数生成结果xml文件。

SAX：
