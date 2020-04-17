修改了Course.xsd，Student.xsd，新增了Department.xsd，PersonInfo.xsd，StudentList.xsd，1.xml；
Department.xsd是单位信息schema，单位信息结构包含院/系/部门的名称、地址、“3位区号-8位号码”格式的电话和传真号；
PersonInfo.xsd是个人信息schema，引用了Department.xsd，个人信息结构包含姓名、性别、出生日期和所在单位信息；
Course.xsd是课程信息schema，课程信息结构包含课程编号、课程名称、一到多位任课教师、上课学期、上课校区、上课地点和课程类型；
Student.xsd是学生信息schema，引用了ScoreList.xsd和PersonInfo.xsd，学生信息结构包含一份个人信息、学号和ta的个人所修课程列表，包括课程信息和课程成绩列表；
StudentList.xsd是学生列表schema，引用了Student.xsd，结构为一个有任意多条学生信息的列表。