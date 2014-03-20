
public class Hora
{
	private int hora = 0;
	private int min = 0;
	private int seg = 0;
	
	Hora (int hora, int min, int seg)
	{
		if (isHora(hora, min, seg)) {
			this.setHora(hora);
			this.setMin(min);
			this.setSeg(seg);
		}
		
		else
			System.out.println ("-- no es una hora valida, no fue asignada --");
	}
	
	// Accesores
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

	// Comportamientos
	//
	
	public void restablecer (int hora, int min, int seg)
	{
		this.setHora(hora);
		this.setMin(min);
		this.setSeg(seg);
	}

	public void adelantar (int hora, int min, int seg)
	{
		if (isHora(hora, min, seg)) {
			int totalHora = getHora() + hora;
			int totalMin = getMin() + min;
			int totalSeg = getSeg() + seg;
			
			if (totalSeg < 60)
				this.setSeg(totalSeg);
			
			else {
				this.setSeg(0);
				totalMin++;
			}

			if (totalMin < 60)
				this.setMin(totalMin);
				
			else {
				this.setMin(0);
				totalHora++;
			}
			
			if (totalHora < 24)
				this.setHora(totalHora);

			else
				this.setHora(totalHora - 24);
		}
		
		else
			System.out.println ("-- la hora ingresada no es valida --");
	}
	
	public void mostrar ()
	{
		System.out.println(this.getHora() 
			+ ":" + this.getMin()
			+ ":" + this.getSeg());
	}
	
	public static boolean isHora (int hora, int min, int seg) 
	{
		boolean isHora = true;
		
		if (hora > 23 && hora < 0
			&& min > 60 && min < 0
			&& seg > 60 && seg < 0) {
			
			isHora = false;
		}
		
		return isHora;
	}
}