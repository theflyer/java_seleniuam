
public class Abstract_Practice {

	
	abstract static class Student{
		private String name;
		private int[] test = {0,0,0,0};
		private String result;
		
		Student(String name){
			this.name=name;
		}

		public String getName() {
			return name;
		}

		public int[] getTest() {
			return test;
		}

		public String getResult() {
			return result;
		}

		public void setName(String name) {
			this.name = name;
		}

		/*public void setTest(int[] test) {
			this.test = test;
		}*/

		public void setResult(String result) {
			this.result = result;
		}
		
		public void setTestScore(int testNumber,int testScore){
			
			if (testNumber>=0 && testNumber < 4){
				this.test[testNumber]=testScore;
				
			}
			
		}
		
		public abstract void generateResult();
		
		
	}
	
	public static class UndergraduateStudent extends Student{
		
		UndergraduateStudent(String name){
			super(name);
		}
		
		@Override
		public void generateResult(){
			
			int[] Scores = super.getTest();
			
			if (Scores.length == 4 ){
				int total = 0;
				for (int i = 0 ; i< Scores.length; i++){
					total += Scores[i];
				}
				int avg = total/Scores.length;
				
				if (avg >= 60){
					super.setResult("Pass");
				}else{
					super.setResult("fail");
				}
			}else{
				System.out.println("Invalid number of tests");
			}
		}
		
	}
	
	public static class GraduateStudent extends Student{
		
		GraduateStudent(String name){
			super(name);
		}
		
		@Override
		public void generateResult(){
			
			int[] Scores = super.getTest();
			
			if (Scores.length == 4 ){
				int total = 0;
				for (int i = 0 ; i< Scores.length; i++){
					total += Scores[i];
				}
				int avg = total/Scores.length;
				
				if (avg >= 70){
					super.setResult("Pass");
				}else{
					super.setResult("fail");
				}
			}else{
				System.out.println("Invalid number of tests");
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Student Un1 = new UndergraduateStudent("Anil");
		Student Un2 = new GraduateStudent("Ani");
		
			
		Un1.setTestScore(0, 70);
		Un1.setTestScore(1, 69);
		Un1.setTestScore(2, 71);
		Un1.setTestScore(3, 55);
		
		Un1.generateResult();
		System.out.println(Un1.getResult());
		
		Un2.setTestScore(0, 70);
		Un2.setTestScore(1, 69);
		Un2.setTestScore(2, 71);
		Un2.setTestScore(3, 55);
		
		Un2.generateResult();
		System.out.println(Un2.getResult());
		
	}
		// TODO Auto-generated method stub
	
}
	
