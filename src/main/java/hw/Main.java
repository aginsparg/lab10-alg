package hw;


import java.util.*;
import org.jgrapht.*;
import org.jgrapht.Graph;
import org.jgrapht.alg.color.GreedyColoring;
import org.jgrapht.graph.*;
import org.jgrapht.traverse.BreadthFirstIterator;
import org.jgrapht.traverse.ClosestFirstIterator;
import org.jgrapht.traverse.DepthFirstIterator;
import org.jgrapht.traverse.RandomWalkIterator;

public class Main {

  public static void main(final String[] args) {
      final String IN = CountryCodes.IN;
      final String MM = CountryCodes.MM;
      final String BD = CountryCodes.BD;
      final String BT = CountryCodes.BT;
      final String NP = CountryCodes.NP;
      final String AF = CountryCodes.AF;


      final Graph<String,DefaultEdge>IndiaMap = new SimpleGraph<>(DefaultEdge.class);
      IndiaMap.addVertex(IN);
      IndiaMap.addVertex(MM);
      IndiaMap.addVertex(BD);
      IndiaMap.addVertex(BT);
      IndiaMap.addVertex(NP);
      IndiaMap.addVertex(AF);

      IndiaMap.addEdge(IN, MM);
      IndiaMap.addEdge(IN, BD);
      IndiaMap.addEdge(IN, BT);
      IndiaMap.addEdge(IN, NP);
      IndiaMap.addEdge(IN, AF);
      IndiaMap.addEdge(BD, MM);

      System.out.println(IndiaMap);

      final Iterator<String>bf = new BreadthFirstIterator<>(IndiaMap, IN);
      while(bf.hasNext()){
          final String country = bf.next();
          System.out.println(country);
      }

System.out.println();

      final Iterator<String>bf2 = new BreadthFirstIterator<>(IndiaMap, MM);
      while(bf2.hasNext()){
          final String country = bf2.next();
          System.out.println(country);
      }


      System.out.println();



      final Iterator<String> df = new DepthFirstIterator<>(IndiaMap, IN);
      while(df.hasNext()){
          final String country = df.next();
          System.out.println(country);
      }

      System.out.println();

      final Iterator<String> df2 = new DepthFirstIterator<>(IndiaMap, MM);
      while(df2.hasNext()){
          final String country = df2.next();
          System.out.println(country);
      }

      System.out.println();


       final Iterator<String> cf = new ClosestFirstIterator<>(IndiaMap, IN);
      while(cf.hasNext()){
          final String country = cf.next();
          System.out.println(country);
      }

      System.out.println();

      final Iterator<String> cf2 = new ClosestFirstIterator<>(IndiaMap, MM);
      while(cf2.hasNext()){
          final String country = cf2.next();
          System.out.println(country);
      }

      System.out.println();



         final Iterator<String> rw = new RandomWalkIterator<>(IndiaMap, IN, false, 12);
       while(rw.hasNext()){
          final String country = rw.next();
          System.out.println(country);
      }

      System.out.println();



      final Iterator<String> rw2 = new RandomWalkIterator<>(IndiaMap, MM, false, 12);
      while(rw2.hasNext()){
          final String country = rw2.next();
          System.out.println(country);
      }

    GreedyColoring India = new GreedyColoring(IndiaMap);
    System.out.println(India.getColoring());
  }
  }
