package com.forca;

public class AdvancedStringMath {

	private int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,x,y,w,z;
	private String palavra;
	
	public AdvancedStringMath(String s) {
		this.palavra = s;
	}

	public int countUniqueLetters(){
		
		int total = 0;
		
		for(int count = 0; count < palavra.length(); count++)
		{
		    char letra = palavra.charAt(count);
		    switch (letra) 
		    {
		        case 'a': a = 1; break;
		        case 'b': b = 1; break;
		        case 'c': c = 1; break;
		        case 'd': d = 1; break;
		        case 'e': e = 1; break;
		        case 'f': f = 1; break;
		        case 'g': g = 1; break;
		        case 'h': h = 1; break;
		        case 'i': i = 1; break;
		        case 'j': j = 1; break;
		        case 'k': k = 1; break;
		        case 'l': l = 1; break;
		        case 'm': m = 1; break;
		        case 'n': n = 1; break;
		        case 'o': o = 1; break;
		        case 'p': p = 1; break;
		        case 'q': q = 1; break;
		        case 'r': r = 1; break;
		        case 's': s = 1; break;
		        case 't': t = 1; break;
		        case 'u': u = 1; break;
		        case 'v': v = 1; break;
		        case 'x': x = 1; break;
		        case 'y': y = 1; break;
		        case 'w': w = 1; break;
		        case 'z': z = 1; break;
		        
		    }
		}
		
		total = a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v+x+y+w+z;
		
		return total;
	}
}
