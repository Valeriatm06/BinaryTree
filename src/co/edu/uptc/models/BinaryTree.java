package co.edu.uptc.models;

import java.util.ArrayList;
import java.util.Comparator;

public class BinaryTree<T> {
   private Node<T> root;
   private Comparator<T> comparator;
   private ArrayList<T> list;

   public BinaryTree(Comparator<T> comparator){
      root = null;
      this.comparator = comparator;
      list = new ArrayList<>();
   }

   public void add(T value){
      Node<T> newNode = new Node<T>(value);
      if(root == null){
         root = newNode;
      }else{
         Node<T> found = findNode(value);
         if((comparator.compare(value, found.getInfo())) > 0){
            found.setHigher(newNode);
         }else found.setLower(newNode);
      }
   }

   private Node<T> findNode(T value){
      Node<T> aux = root;
      boolean found = false;
      while (!found) {
         if((comparator.compare(value, aux.getInfo())) > 0 && aux.getHigher()!= null){
            aux = aux.getHigher();
         }else{
            if((comparator.compare(value, aux.getInfo())) <= 0 && aux.getLower() != null){
               aux = aux.getLower();
            }else{
               found = true;
            }
         }
      }
      return aux;
   }

   public ArrayList showSortData(){
      return recursive(root);
   }

   private  ArrayList recursive(Node<T> aux){
      
      if (aux.getHigher()!= null) 
         recursive(aux.getHigher());

         list.add(aux.getInfo());

      if(aux.getLower()!=null){
         recursive(aux.getLower());
      }
      
      return list;
   }
    
}
