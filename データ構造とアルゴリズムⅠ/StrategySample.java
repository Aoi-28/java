import java.util.Scanner;
public class StrategySample {
interface Strategy{ // �C���^�[�t�F�[�X(Strategy)�����
String function();
}

// �A���S���Y�����N���X�ŃJ�v�Z��������
public static class ConcriteStrategyA implements Strategy{
public String function() {
return "�����`";
}
}


public static class ConcriteStrategyB implements Strategy{
public String function() {
return "�����a";
}
}


public static class ConcriteStrategyC implements Strategy{
public String function() {
return "�����b";
}
}


public static String function(int id){ // �A���S���Y���̐؂�ւ�
Strategy strategy;

if(id==1) strategy = new ConcriteStrategyA();
else if (id==2) strategy = new ConcriteStrategyB();
else strategy = new ConcriteStrategyC();

return strategy.function();
}

public static void main(String[] args){
Scanner stdIn=new Scanner(System.in);

System.out.println("�����̑I���i1:A 2:B ����ȊO:C�j");
int x=stdIn.nextInt();
System.out.println(function(x));
}
}
