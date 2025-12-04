package example01;

public class EmpApp {
    public static void main(String[] args) {
        // 1. 객체 생성
//        this.name=name;
//        this.phone=phone;
//        this.dept=dept;
//        this.empNo=empNo;
//        this.salary=salary;
//        this.account=account;
//        this.position=position;
        Employee[] employees = new Employee[10]; //9로 하면 오류됨


        Employee e1 = new Employee("홍길동", "0102222");
        Employee e2 = new Employee("장보고", "0105555", "개발팀");
        Employee e3 = new Employee("도롱이", "0102222", "인사팀", 3000, 1000000, "계좌:8888", "사원");
        Employee e4 = new Employee("이지윤", "0103333", "개발팀", 3001, 2000000, "계좌:8887", "대리");
        Employee e5 = new Employee("박은서", "0104444", "개발팀", 3002, 3000000, "계좌:8886", "과장");
        Employee e6 = new Employee("김현지", "0106666", "총무팀", 3003, 1000000, "계좌:8885", "사원");
        Employee e7 = new Employee("김민구", "0107777", "인사팀", 3004, 500000, "계좌:8884", "인턴");
        Employee e8 = new Employee("김지민", "0108888", "총무팀", 3005, 500000, "계좌:8883", "인턴");
        Employee e9 = new Employee("이승욱", "0109999", "영업팀", 3006, 2000000, "계좌:8882", "대리");
        Employee e10 = new Employee("김해준", "0101234", "영업팀", 3007, 1000000, "계좌:8881", "사원");

        //e1의 상태 변경하고 싶음
        e1.setDept("총무팀");
        e1.setEmpNo(2900);
        e1.setSalary(1000000);
        e1.setAccount("계좌:9999");
        e1.setPosition("대리");

        e2.setEmpNo(2901);
        e2.setSalary(1000000);
        e2.setAccount("계좌:9998");

        //사원 10명을 employees에 담는다. (배열)
        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;
        employees[3] = e4;
        employees[4] = e5;
        employees[5] = e6;
        employees[6] = e7;
        employees[7] = e8;
        employees[8] = e9;
        employees[9] = e10;


        // 2. 상태 확인
        for (int i = 0; i < employees.length; i++) {
            employees[i].printInfo();


        }
    }
}