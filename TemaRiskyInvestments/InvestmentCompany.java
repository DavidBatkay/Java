import java.util.HashSet;

public class InvestmentCompany {
	private HashSet<Project> companyProjects;

	public InvestmentCompany() {
		this.companyProjects = new HashSet<Project>();
	}
	
	public void addProject(Project p) {
		this.companyProjects.add(p);
	}
	public Project getBestInvestment() {
		double lowestRisk=Double.MAX_VALUE;
		Project lowestRiskProject = null;
		for(Project p : companyProjects) {
			if(p.getRisk()<lowestRisk) {
				lowestRiskProject = p;
			}
		}
		return lowestRiskProject;
	}
	
	public static void main(String[] args) {
		InvestmentCompany angelInvest = new InvestmentCompany();
		Member m1 = new Member(23, "Mihai");
		Member m2 = new Member(41, "Mohammed");
		Member m3 = new Member(22, "Andrei");
		Member m4 = new Member(36, "Sergiu");
		Member m5 = new Member(99, "David");
		Project p1 = new Military("Aircraft", "BomberApp", m5, 20000,"password");
		p1.addMember(m1);
		p1.addMember(m2);
		p1.addMember(m3);
		p1.addMember(m4);
		Project p2 = new Commercial("SodaDispenser", "Fix Bugs", m1, 3000, "12.6.2024", 3);
		p2.addMember(m5);
		p2.addMember(m2);
		p2.addMember(m3);
		p2.addMember(m4);
		Project p3 = new OpenSource("GitHub", "Release 12.2", m5, "mailing_list1", 6000);
		p3.addMember(m1);
		p3.addMember(m2);
		Project p4 = new Commercial("Phone App", "Finish the app", m4, 5000,"3.12.2024", 2);
		p4.addMember(m1);
		p4.addMember(m2);
		p4.addMember(m3);
		angelInvest.addProject(p1);
		angelInvest.addProject(p2);
		angelInvest.addProject(p3);
		angelInvest.addProject(p4);
		System.out.println(angelInvest.getBestInvestment());
	}
}
