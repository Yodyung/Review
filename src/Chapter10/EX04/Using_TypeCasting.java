package Chapter10.EX04;

//업캐스팅 : 자동으로 변환됨(컴파일러가 자동으로 할당)
	//기본 자료형 : 좁은(int) ==> 넓은 범위(double)
	//상속 :		 자식 타입 ==> 부모 타입

//다운캐스팅 : 수동으로 직접 변환 해야한다.
	//기본 자료형 : 넓은 범위(double) ==> 좁은(int), 자료가 소실될 수 있음
	//상속 : 부모 타입 ==> 자식 타입, 실행 시 오류가 발생할 수 있다.

class A{ }
class B extends A{ }
class C extends B{ }
class D extends C{ }


public class Using_TypeCasting {

	public static void main(String[] args) {
		//업캐스팅 : 자동으로 변환됨(컴파일러가 자동으로 할당)
		A ac=(A) new C();	// C --> A 업캐스팅
		B bc=(B) new C();	// C --> B 업캐스팅
		
		//bb는 A,B 포함하고 있고 B타입으로 지정(A,B 모두 사용됨)
		B bb=new B();
		A a=(A) bb;			// B --> A 업캐스팅 (A필드, 메소드 사용)
		
		
		//다운캐스팅 : 수동으로 직접 변환 해야함. 캐스팅이 불가능한 경우 실행 시 오류, 다운캐스팅이 불가능.
		A aa=new A();	//aa는 A타입만 내포하고 있음.
//		B b=(B)aa;		//aa는 B타입을 내포하고 있지 않으므로 다운 캐스팅을 할 수 없다. 구문은 문제가 없지만 실행 시 문제 발생.
//		C c=(C)aa;		//aa는 C타입을 내포하고 있지 않으므로 다운 캐스팅을 할 수 없다. 구문은 문제가 없지만 실행 시 문제 발생.
		
		//다운캐스팅 가능한 경우
		A ab = new B();		//ab는 A,B를 내포하고 있다. A타입으로 지정됨.
		B b=(B)ab;			//A(부모) ==> B(자식)
//		C c=(C)ab; 			//ab는 C 타입을 내포하고 있지 않음. 캐스팅이 불가능. 구문은 문제가 없지만 실행 시 문제 발생.

		B bd=new D();		//bd는 A,B,D를 내포하고 있고, B타입으로 지정. bd는 A,B의 필드와 메소드에 접근
		D d=(D)bd;			//bd는 D를 내포하고 있고, B->D타입으로 다운캐스팅. d는 A,B,D의 모든 필드와 메소드 사용 가능
//		C c=(C)bd;			//bd는 C 타입을 내포하고 있지 않음. 캐스팅이 불가능. 구문은 문제가 없지만 실행 시 문제 발생.
	
		A ad=new D();		//ad는 A,B,D를 내포하고 있고, A타입으로 지정.
		B b1=(B)ad;			//A ==> B 타입으로 다운캐스팅
		D d1=(D)ad;			//A ==> D 타입으로 다운캐스팅
//		C c5=(C)ad;			//ad는 C 타입을 내포하고 있지 않음. 캐스팅이 불가능. 구문은 문제가 없지만 실행 시 문제 발생.
		
		
		
		
	}

}
