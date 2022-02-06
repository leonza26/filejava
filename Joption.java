import javax.swing.JOptionPane;

public class Joption{
	public static void main(String[] args){
		JOptionPane.showMessageDialog(null, "Hello World");
	String name, work, pay;
	//string name
	name = JOptionPane.showInputDialog("What is your name?");
	//string work
	work = JOptionPane.showInputDialog("How many hours did you work this week?");
	//string pay
	pay = JOptionPane.showInputDialog("What is your hourly pay rate?");

	// message
	JOptionPane.showMessageDialog(null, "Hello Joe Mahoney. Your gross pay is $800.0");
	}
}