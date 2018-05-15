package mx.com.vrm.viai.test;

import java.io.IOException;

//import com.jcraft.jsch.JSchException;
//import com.jcraft.jsch.SftpException;

import mx.com.vrm.viai.configuration.util.SFTPConnector;

public class LinuxCommandTest {

	private static final String USERNAME = "jheuser";
	private static final String HOST = "10.1.12.78";
	private static final int PORT = 22;
	private static final String PASSWORD = "F3rr0suR";

//	public static void main(String[] args) throws SftpException {
//
//		try {
//			SFTPConnector sshConnector = new SFTPConnector();
//			sshConnector.connect(USERNAME, PASSWORD, HOST, PORT);
//			String resultado = sshConnector.executeCommand("ls -lta");
//			String result = sshConnector.executeCommand("./showproc.sh");
//			
//			System.out.println("resultado::" + resultado);
//			System.out.println("resultado::" + result);
//			sshConnector.disconnect();
//		} catch (JSchException ex) {
//			ex.printStackTrace();
//
//			System.out.println(ex.getMessage());
//		} catch (IllegalAccessException ex) {
//			ex.printStackTrace();
//
//			System.out.println(ex.getMessage());
//		} catch (IOException ex) {
//			ex.printStackTrace();
//
//			System.out.println(ex.getMessage());
//		}
//	}
}
