
public class Aluno {

	private String strNome;
	private int intMatricula;
	private String strSerie;

	//Constructors 
	public Aluno(String strNome, int intMatricula, String strSerie) {
		super();
		this.strNome = strNome;
		this.intMatricula = intMatricula;
		this.strSerie = strSerie;
	}
	public Aluno() {

	}
	
	//Getters and Setters
	public String getStrNome() {
		return strNome;
	}
	public void setStrNome(String strNome) {
		this.strNome = strNome;
	}
	public int getIntMatricula() {
		return intMatricula;
	}
	public void setIntMatricula(int intMatricula) {
		this.intMatricula = intMatricula;
	}
	public String getStrSerie() {
		return strSerie;
	}
	public void setStrSerie(String strSerie) {
		this.strSerie = strSerie;
	}
	@Override
	public String toString() {
		return "Aluno [strNome=" + strNome + ", intMatricula=" + intMatricula + ", strSerie=" + strSerie + "]";
	}
	
	
}
