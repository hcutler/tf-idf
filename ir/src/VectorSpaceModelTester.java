//package ir;

import java.util.ArrayList;

/**
 * the tester class.
 * @author swapneel
 */
public class VectorSpaceModelTester {

	public static void main(String[] args) {
		
		Document query = new Document("ds_IBM");
		Document d1 = new Document("ds_2012");
		Document d2 = new Document("ds_2013");
		Document d3 = new Document("ds_2014");
		Document d4 = new Document("ds_2015");

	
		ArrayList<Document> documents = new ArrayList<Document>();
		documents.add(query);
		documents.add(d1);
		documents.add(d2);
		documents.add(d3);
		documents.add(d4);
//		documents.add(d5);
//		
//		documents.add(hpcs);
//		documents.add(hpdh);
//		documents.add(gray);
		
		Corpus corpus = new Corpus(documents);
		
		VectorSpaceModel vectorSpace = new VectorSpaceModel(corpus);
		
//		for (int i = 0; i < documents.size(); i++) {
//			for (int j = i + 1; j < documents.size(); j++) {
//				Document doc1 = documents.get(i);
//				Document doc2 = documents.get(j);
//				System.out.println("\nComparing " + doc1 + " and " +  doc2);
//				System.out.println(vectorSpace.cosineSimilarity(doc1, doc2));
//			}
//		}
		

		for(int i = 1; i < documents.size(); i++) {
			Document doc = documents.get(i);
			System.out.println("\nComparing to " + doc);
			System.out.println(vectorSpace.cosineSimilarity(query, doc));
		}
	}

}
