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

        Employee[] employees = new Employee[10]; //상태변경까지 작성 후 적기
        //9로 하면 오류됨

        //ctrl+e+enter 로 왔다갔다하면서 빠르게 찾기
        Employee e1 = new Employee("홍길동", "0102222");
        Employee e2 = new Employee("장보고", "0105555", "개발팀");
        Employee e3 = new Employee("도롱이", "0102222", "인사팀", 3000, 1000, "계좌:8888", "사원");
        Employee e4 = new Employee("이지윤", "0103333", "개발팀", 3001, 1000, "계좌:8887", "과장");
        Employee e5 = new Employee("박은서", "0104444", "개발팀", 3002, 1000, "계좌:8886", "대리");
        Employee e6 = new Employee("김현지", "0106666", "총무팀", 3003, 1000, "계좌:8885", "사원");
        Employee e7 = new Employee("김민구", "0107777", "인사팀", 3004, 1000, "계좌:8884", "사원");
        Employee e8 = new Employee("김지민", "0108888", "총무팀", 3005, 1000, "계좌:8883", "부장");
        Employee e9 = new Employee("이승욱", "0109999", "영업팀", 3006, 1000, "계좌:8882", "사원");
        Employee e10 = new Employee("김해준", "0101234", "영업팀", 3007, 1000, "계좌:8881", "사원");

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

        //2. 상태변경

        e1.setDept("총무팀");//e1의 상태 변경하고 싶음
        e1.setEmpNo(2900);
        e1.setSalary(1000);
        e1.setAccount("계좌:9999");
        e1.setPosition("사원");

        e2.setEmpNo(2901);
        e2.setSalary(1000);
        e2.setAccount("계좌:9998");



        //employees[0] = e1; 작성 후 기재
        // 2. 상태 확인
        for (int i = 0; i < employees.length; i++) {
            employees[i].printInfo();

            /**크기만큼만 돔
             * for(   : ) for each 형식
             *
             */
        }    //4. 전체직원의 월급 출력
        int totalMonthSalary = 0;
        for (int i = 0; i < 10; i++) {
            totalMonthSalary = totalMonthSalary + employees[i].getSalary();

        }
        System.out.println("기본 월급 총액 = " + totalMonthSalary + "원");



        int totalYearSalary = 0;
        for (int i = 0; i < 10; i++) {
        totalYearSalary = totalYearSalary + employees[i].getSalary()*12;

        }
        System.out.println("기본 연봉 총액 = " + totalYearSalary + "원");


        // 6. 전체직원의 연봉 + 보너스 출력
        /**
         * - `"사원"` : 기본 연봉의 10% 보너스
         * - `"대리"` : 기본 연봉의 20% 보너스
         * - `"과장"` : 기본 연봉의 30% 보너스
         */
        int totalYearSalaryWithBonus = 0;
        for (int i = 0; i < 10; i++) {
            int 연봉 = employees[i].getSalary()*12;
            int 연봉과보너스 = 0;
            if(employees[i].getPosition().equals("사원")){
                연봉과보너스 = (int) (연봉 * 1.1);
            } else if (employees[i].getPosition().equals("대리")) {
                연봉과보너스 = (int) (연봉 * 1.2);
            } else if (employees[i].getPosition().equals("과장")) {
                연봉과보너스 = (int) (연봉 * 1.3);
            } else {
                연봉과보너스 =(int) (연봉 * 1.4);
            }

            totalYearSalaryWithBonus = totalYearSalaryWithBonus + 연봉과보너스;


        }
        System.out.println("보너스 포함 연봉 총액 = " + totalYearSalaryWithBonus + "원");

        //7. 도롱이 사원->대리 승진시키기
        for (int i = 0; i < 10; i++) {
            if(employees[i].getName().equals("도롱이")){
                if(employees[i].getPosition().equals("사원")){
                    employees[i].setPosition("대리");
                }else if(employees[i].getPosition().equals("대리")){
                    employees[i].setPosition("과장");
                }else if(employees[i].getPosition().equals("과장")){
                    employees[i].setPosition("부장");
                }
            }
        }
        for (int i = 0; i < 10; i++) { // for Each 써보기
            employees[i].printInfo(); //도롱이 대리로 승진완료
        }
        // 8. 월급이체
        for(int i=0; i<10; i++){
            System.out.println("[급여 이체 완료] "+employees[i].getName()+"님께 3000000원이 "+employees[i].getAccount()+" 계좌로 지급되었습니다.");

        }

    }
}