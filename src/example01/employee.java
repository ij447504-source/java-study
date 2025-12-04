package example01;

public class Employee {
    //1. 상태만들기 + getter, setter
    //2. 생성자 만들기(오버로딩)
    //1-2번까지 해보기

    private String name;
    private String phone;
    private String dept;
    private int empNo; //사원번호
    private int salary;
    private String account;
    private String position;



    //생성자 3개 만들기
    Employee(String name, String phone){
        this.name=name;
        this.phone=phone;
        dept="미정";
        empNo=0;
        salary=0;
        account="";
        position="사원";
    }
    Employee(String name, String phone, String dept){
        this.name=name;
        this.phone=phone;
        this.dept=dept;
        empNo=0;
        salary=0;
        account="";
        position="사원";
    }
    Employee(String name, String phone,String dept,int empNo,int salary,String account,String position){
        this.name=name;
        this.phone=phone;
        this.dept=dept;
        this.empNo=empNo;
        this.salary=salary;
        this.account=account;
        this.position=position;

    }
    // 책임 : 사원의 모든 정보를 한 줄 또는 여러 줄로 보기 좋게 출력하세요.
    void printInfo(){
        System.out.println(getName()+"/"+getPhone()+"/"+getDept()+"/"+getEmpNo()+"/"+getPosition()+"/"+getSalary()+"/"+getAccount());
    }



    // 책임 : empNo 상태변경
    public void setName(String name) {
        this.name = name; //상태변경 메서드
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public void setPosition(String position) {
        this.position = position;
    }


    // 책임 : empNo 상태확인
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public String getDept() {
        return dept;
    }
    public int getEmpNo() {
        return empNo;
    }
    public int getSalary() {
        return salary;
    }
    public String getAccount() {
        return account;
    }
    public String getPosition() {
        return position;
    }
}
