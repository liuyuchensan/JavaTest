package work4;
import java.util.Scanner;
public class Homework5 {	                                                          
	        public  void ret(int z, int x,int v) {  
	        	int[] y1 = {31,28,31,30,31,30,31,31,30,31,30,31};
	        	int[] y2 = {31,29,31,30,31,30,31,31,30,31,30,31};
	        	int day =0;
	        	 if((x==1||x==3||x==5||x==7||x==8||x==10||x==12)&&v>31){
	        		System.out.print("請輸入正確");
					return;	
	        	 	}else if((x==4||x==6||x==9||x==11)&&v>30){
     				System.out.print("請輸入正確");
     				return;
	        	 	}else if(x <= 12 && z%4 != 0&& x>0&&x!=2&&v!=0){
	        			for(int y = 0;y<x-1;y++) {
	        				day += y1[y];
	        			}
	        				day += v;
	        		}else if(x <= 12 && z%4 == 0&& x>0&&x!=2&&z%100 !=0) {
	        			for(int y = 0;y<x-1;y++) {
	        				day += y2[y];
	        			}
	        				day += v;
	        		}else if(x ==2&&v<29&& z%4 != 0) {
	        				day = 31+v;
	        		}else if(x ==2&&v<30&& z%4 == 0 && z%100 !=0) {
	        				day = 31+v;
	        			
	        		}else{
	        				System.out.print("請輸入正確");
	        				return;
	        			}
	        			System.out.print(day);
	        		}
	        public static void main(String[] args){
	        	 Homework5 h = new  Homework5();
	            Scanner a = new Scanner(System.in);
	            System.out.print("年"   );
	            int math_1 = a.nextInt();
	            System.out.print("月"   );
	            int math_2 = a.nextInt();
	            System.out.print("日"   );
	            int math_3 = a.nextInt();
	        
	            h.ret(math_1,math_2,math_3);
	            
	            a.close();
	        }
	        
	    }

