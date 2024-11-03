package ex;

public class Employe {
	private String nom;
	private int salaire;
	
	public Employe(String nom,int salaire){
		this.nom=nom;
		this.salaire=salaire;
	}	
		public void afficherInfos() {

			System.out.println("le nom est:"+nom+",le salaire est:"+ salaire);
		}
		
	public class Developpeur extends Employe {

		private String langage;
		
		public Developpeur(String nom,int salaire,String langage) {
			super(nom,salaire);
			this.langage=langage;
		}

		@Override
		public void afficherInfos() {
			// TODO Auto-generated method stub
			super.afficherInfos();
	        System.out.println("Nom : " + nom + ", Salaire : " + salaire + ", langage : " +langage);

		}
		public void afficherLangage() {
			System.out.println("le langage utilisé par le développeur :"+langage);
		}
	}
	public class Manager extends Employe{
		private static int nombreDeSubordonnes;	
		public Manager(String nom, int salaire,int nombreDeSubordonnes) {
			super(nom, salaire);
			this.nombreDeSubordonnes=nombreDeSubordonnes;

			// TODO Auto-generated constructor stub
		}
		@Override
		public void afficherInfos() {
			// TODO Auto-generated method stub
			super.afficherInfos();
	        System.out.println("Nom : " + nom + ", Salaire : " + salaire + ", Nombre de subordonnés : " + nombreDeSubordonnes);
		}
		public void gererEquipe() {
			System.out.println("gerer un equipe de:"+nombreDeSubordonnes);
		}
		public class Polymorphisme {
			public static void main(String[] args) {
				Employe[] employes= new Employe[] {
						new Developpeur("hala",5000,"java"),
						new 	Manager("sara",600,20),
				};
				for(Employe employe:employes) {
					employe.afficherInfos();
				}
				//upcasting
				Employe emp=new Developpeur("can",4000,"python");
				emp.afficherInfos();
				}
			//downcasting
			//pour dev
			Employe emp=new Developpeur("can",4000,"python");
			if(emp instanceof Developpeur) {
			((Developpeur)emp).afficherLangage();
			}
			//pour manager
			Employe emp1=new Manager("can",4000,30);
			if(emp1 instanceof Manager) {
			((Manager)emp1).gererEquipe();
			}
		}
	}
		
	
}}

