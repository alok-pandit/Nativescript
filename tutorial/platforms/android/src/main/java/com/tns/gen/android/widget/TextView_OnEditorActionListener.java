package com.tns.gen.android.widget;

public class TextView_OnEditorActionListener implements android.widget.TextView.OnEditorActionListener {
	public TextView_OnEditorActionListener() {
		com.tns.Runtime.initInstance(this);
	}

	public boolean onEditorAction(android.widget.TextView param_0, int param_1, android.view.KeyEvent param_2)  {
		java.lang.Object[] args = new java.lang.Object[3];
		args[0] = param_0;
		args[1] = param_1;
		args[2] = param_2;
		return (boolean)com.tns.Runtime.callJSMethod(this, "onEditorAction", boolean.class, args);
	}

}
