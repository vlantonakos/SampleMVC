package sample.model;

import java.util.ArrayList;

public class MVCFactory {

	private ArrayList<Whatsit> whatsitList;
	private ArrayList<Widget> widgetList;
	private int widgetResourceCount;
	private int whatsitResourceCount;
	
	public MVCFactory() {
		whatsitList = new ArrayList<Whatsit>();
		widgetList = new ArrayList<Widget>();
		
		widgetResourceCount = 15;
		whatsitResourceCount = 10;
	}
	
	public ArrayList<Whatsit> getWhatsitList() {
		return whatsitList;
	}

	public void setWhatsitList(ArrayList<Whatsit> whatsitList) {
		this.whatsitList = whatsitList;
	}

	public ArrayList<Widget> getWidgetList() {
		return widgetList;
	}

	public void setWidgetList(ArrayList<Widget> widgetList) {
		this.widgetList = widgetList;
	}

	public int getWidgetResourceCount() {
		return widgetResourceCount;
	}

	public void setWidgetResourceCount(int widgetResourceCount) {
		this.widgetResourceCount = widgetResourceCount;
	}

	public int getWhatsitResourceCount() {
		return whatsitResourceCount;
	}

	public void setWhatsitResourceCount(int whatsitResourceCount) {
		this.whatsitResourceCount = whatsitResourceCount;
	}

	public boolean makeWhatsit(int size, String name) {
		boolean canMakeWhatsit = false;
		
		if(whatsitResourceCount > 5) {
			Whatsit currentWhatsit = new Whatsit(size, name);
			whatsitResourceCount -= 5;
			whatsitList.add(currentWhatsit);
			canMakeWhatsit = true;
		}
		return canMakeWhatsit;
	}
	
	public boolean makeWidget(double weight, String description) {
		boolean canMakeWidget = false;
		
		if(widgetResourceCount > 0) {
			Widget currentWidget = new Widget(weight, description);
			widgetResourceCount--;
			widgetList.add(currentWidget);
			canMakeWidget = true;
		}
		return canMakeWidget;
	}

}
