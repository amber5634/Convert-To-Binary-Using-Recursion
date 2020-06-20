import java.io.*;
public class BinaryConversion
{
	public static String B(int N)
	{
	if(N==0)
	return "0";
	if(N==1)
	return "1";
	return B(N/2)+N%2;
	}
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		System.out.println(B(N));	
	}

}