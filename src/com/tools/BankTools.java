package com.tools;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.account.Account;
import com.account.Transaction;
import com.user.Customer;

public class BankTools {
	
	public String saveAllData(ArrayList<Customer> customer) {
		String sendToSave = "";
		for(Customer c: customer) {
			sendToSave += c.toString();
			for(Account a: c.getAccountList()) {
				sendToSave += a.toString();
				for(Transaction t: a.getTransactions()) {
					sendToSave += t.toString();
				}
			}
			sendToSave += "\n";
		}
		return sendToSave;	
	}
	
	public static void save(String pathAndFileName, String data) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathAndFileName, true))){
			bw.append(data);
			System.out.println("All Good here.");
		}catch(IOException e) {	}	
	}
	
}
