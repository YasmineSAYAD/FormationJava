import java.util.*;
public class Calendrier {


	public static void main(String[]strings) {
		Scanner sc=new Scanner(System.in);
		String mat[][]={{"Lu","ma","me","je","ve","sa","di"},{" ","1","2","3","4","5","6"},{"7","8","9","10","11","12","13"},{"14","15","16","17","18","19","20"},{"21","22","23","24","25"	,"26","27"},{"28","29","30","31"," "," "," "}};
		System.out.println("veuillez saisir une date:");
	
		String dat=sc.nextLine();
		
		String ch=dat.substring(0, 2);
		String jour = null;
		int nb=0;
		
		
	
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				
				
				if (ch.equals(mat[i][j])){
					
					
					if (mat[0][j]=="Lu") {
						jour="Lundi";
						
						
					}else {
						if (mat[0][j]=="ma") {
							jour="mardi";
						}else {
							if (mat[0][j]=="me") {
								jour="mercredi";
								
							}else {
								if (mat[0][j]=="je") {
								jour="jeudi";
									
								}else {
									if (mat[0][j]=="ve") {
										jour="vendredi";
										
									}else {
										if (mat[0][j]=="sa") {
											jour="samedi";
											
										}else {
											jour="dimanche";
										}
									}
								}
							}
						}
							
						}
					System.out.println("le "+ch+" est un "+jour);
					
							
				}
				
					
						
						
									
				}	
							
						}
					
				
					
			
				
		
			
	
				
			
		System.out.println(" il exist "+nb+" "+jour+" dans ce mois");
			
		}

	}


