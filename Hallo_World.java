public class Hallo_World {
	public static void main(String[] args) {
	     //num6() ;
		 //System.out.print((5+(3-1)*23)%57+(211%3));
		 //num29();
		 //num52() ;
		
	}
	
	
	public static void num6() {
		//Дан символ C, изображающий цифру или букву (латинскую или кириллическую).Если C изображает цифру, то вывести строку «digit», если латинскую букву — вывести строку «lat», если кириллическую — вывести строку «rus».
		
		String c = "g" ; // символ C, изображающий цифру или букву
		String ru[] = {"А" , "а" , "Б" , "б" , "В" , "в" , "Г" , "г" , "Д" , "д" , "Е" , "е" , "Ё" , "ё" , "Ж" , "ж" , "З" , "з" , "И" , "и" , "Й" , "й" , "К" , "к" , "Л" , "л" , "М" , "м" , "Н" ,"н" , "О" , "о" , "П" , "п" , "Р" , "р" , "С" , "с" , "Т" , "т" , "У" ,"у" , "Ф" , "ф" , "Х" , "х" , "Ц" , "ц" , "Ч" , "ч" , "Ш" , "ш" , "Щ" , "щ" , "Э" , "э" , "Ю" , "ю" , "Я" , "я" , "Ь" , "ь" , "Ы" , "ы" , "Ъ" , "ъ"} ; 
		String digit[] = {"1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "0"};
		String lat[] = {"A" , "a" , "B" , "b" , "C" , "c" , "d" , "D" , "E" , "e" , "F" , "f" , "G" , "g" , "H" , "h" , "i" , "I" , "J" , "j" , "K" , "k" , "L" , "l" , "M" , "m" , "N" , "n" , "O" ,"o" , "P" , "p" , "Q" , "q" , "R" , "r" , "S" , "s" , "T" , "t" , "U" ,"u" , "V" , "v" , "W" , "w" , "X" , "x" , "Y" , "y" , "Z" , "z"} ; 
		
		
		for(int i = 0 ; i < ru.length ; ) {
			if(ru[i] != c) {
				i++ ;				
			} else if(ru[i] == c) {
			    System.out.print("rus");
			    return ;
			    }
			}
		
		for(int i = 0 ; i < digit.length ; ) {
			if(digit[i] != c) {
				i++ ;
			} else if(digit[i] == c) {
			    System.out.print("digit");
			    return ;
			    }
			}
		
		for(int i = 0 ; i < lat.length ; ) {
			if(lat[i] != c) {
				i++ ;
			} else if(lat[i] == c) {
			    System.out.print("lat");
			    return ;
			    }
			}
		
	}
	
	public static void num29() {
	//  Дан символ C и строки S, S0. Перед каждым вхождением символа C в строку S вставить строку S0.
		char c = 'i' ;
		String s = " i , guys !" , s0 = "h" , f ="" ;
		char[] sArray = s.toCharArray();
		for(int i = 0 ; i < s.length() ; i++) {
			if(sArray[i] == c ) {
				f = f + s0 + c ;
			}else {
				f = f + sArray[i];
			}
		}
		System.out.print(f);
	}
	
	
	public static void num52() {
		//Дана строка-предложение заданное кириллицей. Преобразовать строку так, чтобы каждое слово начиналось с заглавной буквы. Словом считать набор символов, не содержащий пробелов и ограниченный пробелами или началом/концом строки. Слова, не начинающиеся с буквы, не изменять.

		String line = "мы работали в саду", newLine = "";
		newLine = newLine + line.substring(0, 1).toUpperCase(); //первый символ делаем заглавным
		char[] lineArray = line.toCharArray() ;
		for (int i = 1; i < line.length(); i++) {
		    
		    if (" ".equals(line.substring(i-1, i)) && !" ".equals(line.substring(i+1, i+2))) {
		    	newLine = newLine + line.substring(i, i+1).toUpperCase();
		  } else {
		    	newLine = newLine + line.substring(i, i+1);
		  }
		}
		System.out.print(newLine) ;
	}
}