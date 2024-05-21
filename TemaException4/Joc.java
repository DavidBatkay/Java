
public class Joc {

	private String numeEchipa1,numeEchipa2;
	private int goluriEchipa1,goluriEchipa2,totalOut,totalCorner;
	
	public Joc(String numeEchipa1, String numeEchipa2) {
		this.numeEchipa1 = numeEchipa1;
		this.numeEchipa2 = numeEchipa2;
		this.goluriEchipa1 = 0;
		this.goluriEchipa2 = 0;
		this.totalCorner = 0;
		this.totalOut = 0;
	}
	
	
	public String toString() {
		return this.numeEchipa1+" ["+this.goluriEchipa1+"-"+this.goluriEchipa2+"] "+this.numeEchipa2
				+'\n'+"Out-uri: "+this.totalOut+'\n'+"Cornere: "+this.totalCorner;
	}
	
	public void simuleaza() {
		
		Minge m1 = new Minge(50,25);
		System.out.println("Incepe meciul! "+this.numeEchipa1+" - "+this.numeEchipa2);
		for(int i=0;i<1000;i++) {
			try {
				System.out.println("| "+this.numeEchipa1+" - "+this.numeEchipa2+" | "+m1);
				m1.suteaza();
			} catch (Gol e) {
				if(m1.getX()<=0)
					this.goluriEchipa2++;
				else this.goluriEchipa1++;
				System.err.println(e+" "+m1+" la pasa #"+i);
				m1=new Minge(50,25);
				
			} catch (Corner e) {
				this.totalCorner++;
				int newX,newY;
				if(m1.getX()==100) newX=100;
				else newX=0;
				if(m1.getY()<20) newY=0;
				else newY=50;
				System.out.println(e+" "+m1);
				m1=new Minge(newX,newY);
			} catch (Out e) {
				this.totalOut++;
				System.out.println(e+" "+m1);
				m1=new Minge(m1.getX(),m1.getY());
			}
		}
		System.out.println("Finalul meciului "+this.numeEchipa1+" - "+this.numeEchipa2);
	}


	public String getNumeEchipa1() {
		return numeEchipa1;
	}


	public String getNumeEchipa2() {
		return numeEchipa2;
	}


	public int getGoluriEchipa1() {
		return goluriEchipa1;
	}


	public int getGoluriEchipa2() {
		return goluriEchipa2;
	}


	public int getTotalOut() {
		return totalOut;
	}


	public int getTotalCorner() {
		return totalCorner;
	}
	
	
}
