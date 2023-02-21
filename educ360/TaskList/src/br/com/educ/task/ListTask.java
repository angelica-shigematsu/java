package br.com.educ.task;

import java.util.ArrayList;
import java.util.Collections;

public class ListTask {
	private String title;

	ArrayList<String> list = new ArrayList<>();

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public void addTask(String title) {
		boolean existsTask = false;
		for (int index = 0; index < list.size(); index++) {
			if(list.get(index).equals(title)) {
				existsTask = true;
			}
		}
		if (existsTask != true) {
			list.add(title);
		} else {
			System.out.println("Já existe a tarefa " + title);
		}
	}

	public void removeTask(String title) {
		if (list.isEmpty()) {
			System.out.println("\nA lista está vazia\n");
		}else {
			this.list.remove(title);
		}
	}
	
	public void listOrderASC() {
		Collections.sort(this.list);
		for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
	}
	
	public void listOrderDESC() {
		Collections.reverse(this.list);
		for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
	}

	public void listTasks() {
		for (int index = 0; index < this.list.size(); index++) {
			System.out.println(this.list.get(index));
		}
	}
}
