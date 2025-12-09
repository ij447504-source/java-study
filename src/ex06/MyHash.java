package ex06;

class Data{
    int num;

    public Data(int num){
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();  //super 자기 부모의 주소를 의미
    }
}
public class MyHash extends Object{
    public static void main(String[] args) {
        Data d1 = new Data(1);
        Data d2 = new Data(1);
        Data d3 =d1; //얕은 복사

        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());

        if(d1.hashCode()==d2.hashCode()){
            System.out.println("같은 주소에 있는 객체");
        }else{
            System.out.println("다른 주소에 있는 개체");

        }
        if(d1.num ==d2.num){
            System.out.println("값 같음");
        }else{
            System.out.println("값 다름");
        }
        if(d1.hashCode()==d3.hashCode()){
            System.out.println("같아요!! 얕은복사 됐어요");
        }else{
            System.out.println("달라요!! new가 된 다른 주소 같아요 ");
        }
    }
}
