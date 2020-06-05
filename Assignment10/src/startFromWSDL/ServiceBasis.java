package startFromWSDL;

import startFromWSDL.types.学生列表类型;

public abstract class ServiceBasis {
    protected 学生列表类型 studentList;

    public ServiceBasis(学生列表类型 studentList) {
        this.studentList = studentList;
    }
}
