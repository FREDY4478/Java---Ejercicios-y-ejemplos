
public class Hora
{
	private int hora = 0;
	private int min = 0;
	private int seg = 0;
	
	Hora (int hora, int min, int seg)
	{
		this.setHora(hora);
		this.setMin(min);
		this.setSeg(seg);
	}
	
	// Métodos accesores
	//

	public void setHora (int hora) 
	{
		if (hora >= 0 && hora < 24)
			this.hora = hora;
		else
			System.out.println ("-- error en asignar hora --");
	}

	public int getHora () { return this.hora; }

	public void setSeg (int seg) 
	{
		if (seg >= 0 && seg < 60)
			this.seg = seg;
		else
			System.out.println ("-- error en asignar segundo --");
	}

	public int getSeg () { return this.seg; }

	public void setMin (int min) 
	{
		if (min >= 0 && min < 60)
			this.min = min;
		else
			System.out.println ("-- error en asignar minuto --");
	}

	public int getMin () { return this.min; }

	// Acciones
	//
	
	public void restablecer (int hora, int min, int seg)
	{
		this.setHora(hora);
		this.setMin(min);
		this.setSeg(seg);
	}

	public void adelantar (int hora, int min, int seg)
	{
		int totalHora = getHora() + hora;
		int totalMin = getMin() + min;
		int totalSeg = getSeg() + seg;

		if (24 < totalHora
			&& 60 < totalMin
			&& 60 < totalSeg) {

			this.setHora(totalHora);
			this.setMin(totalMin);
			this.setSeg(totalMin);
		}
	}

	public void mostrar ()
	{
		System.out.println(this.getHora() 
			+ ":" + this.getMin()
			+ ":" + this.getSeg());
	}
}