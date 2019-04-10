package inheritance;

public abstract class BankSuper {

 //서브클래스들 중에 2개 이상의 클래스에서 중복되는 멤버 변수 목록 나열
 protected String accountNumberStr;//계좌번호
 protected String customName;//고객명
 private static int totalCount;
 //이율
 protected int period;//기간
 protected int interestRate;//이자액
 protected long totalAmount;//만기시 금액
 
 
 public BankSuper() { 
  createNumber();
 }
 
 public void output() { }
 public void inputProc() { }
 public void calc() {  }
 protected abstract void createAccountNumber(); 
 private void createNumber() {
  totalCount++;
  createAccountNumber(); //서브 클래스의 오버라이딩된 메서드 실행됨
 }
 public int getTotalCount() {
  return totalCount;
 }
}