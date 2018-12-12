package com.company;

import java.util.ArrayList;

public class Digits
{
  ArrayList<Integer> digitList = new ArrayList<>();
  public Digits(int num)
  {
    String x = String.valueOf(num);
    for(int i = 1; i < x.length()+1; i ++)
    {
      digitList.add(Integer.parseInt(x.substring(i-1,i)));
    }
  }
  
  public boolean isStrictlyIncreasing()
  {
    for(int i = 1; i < digitList.size(); i++)
    {
      if(digitList.get(i-1)>= digitList.get(i))
      {
        return false;
      }
    }
    return true;
  }

  public String getDigitList()
  {
    String x = "[";
    for(int i = 0; i < digitList.size()-1; i ++)
    {
      x += digitList.get(i) + ", ";
    }
    return  x + digitList.get(digitList.size()-1)+ "]";
  }

}
