package Harish;
class Thisthing{
			/*int l;
			int b;*/
			int result;
			void getData (int l, int b) {
				result = l*b;
				}
			void showData() {
				System.out.println( "result"  + result);
				
			}

		}
	public class HelloThis{
		public static void main (String[] args) {
			Thisthing s1= new Thisthing();//,s2 = new West(),s3= new West();
			s1.getData(10,4);
			s1.showData();
			//s2.getData(103,"xyyz");
			//s2.showData();
		}
	}