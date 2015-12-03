import java.util.Scanner;
public class StrategySample {
interface Strategy{ // インターフェース(Strategy)を作る
String function();
}

// アルゴリズムをクラスでカプセル化する
public static class ConcriteStrategyA implements Strategy{
public String function() {
return "処理Ａ";
}
}


public static class ConcriteStrategyB implements Strategy{
public String function() {
return "処理Ｂ";
}
}


public static class ConcriteStrategyC implements Strategy{
public String function() {
return "処理Ｃ";
}
}


public static String function(int id){ // アルゴリズムの切り替え
Strategy strategy;

if(id==1) strategy = new ConcriteStrategyA();
else if (id==2) strategy = new ConcriteStrategyB();
else strategy = new ConcriteStrategyC();

return strategy.function();
}

public static void main(String[] args){
Scanner stdIn=new Scanner(System.in);

System.out.println("処理の選択（1:A 2:B それ以外:C）");
int x=stdIn.nextInt();
System.out.println(function(x));
}
}
