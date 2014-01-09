package com.example.foo.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

interface MyServiceAsync {
  public void myMethod(String s, AsyncCallback<String> callback);
}