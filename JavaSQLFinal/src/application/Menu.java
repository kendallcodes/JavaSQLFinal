package application;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import dao.AlbumDao;

public class Menu {
    
		private AlbumDao albumDao = new AlbumDao();
		private final String DATABASE_NAME = "recording_artists";
		private Scanner scanner = new Scanner(System.in);
		private List<String> options = Arrays.asList("Display All Albums",
				 									 "Add A New Album", 
													 "Delete An Album",
													 "Update An Album",
													 "Display All Artists",
				 									 "Add A New Artist", 
													 "Delete An Artist",
													 "Update An Artist",
													 "Display All Certifications",
				 									 "Add A New Certification", 
													 "Delete A Certification",
													 "Update A Certification");
		
		public void start() {
			String selection = "";
	

			do {
				printMenu();
				scanner = new Scanner(System.in);
				selection = scanner.nextLine();
				
				try {
				
					if (selection.equals("1") ) {
						System.out.println("\tDisplaying all albums...");
						displayAllAlbums();
					} else if (selection.equals("2") ) {
						System.out.println("\tAdding an album...");
						addNewAlbum();
					} else if (selection.equals("3") ) {
						System.out.println("\tDeleting an album...");
						deleteAlbum();
					} else if (selection.equals("4") ) {
						System.out.println("\tUpdating an album...");
						updateAlbum();
					} else if (selection.equals("5") ) {
						System.out.println("\tDisplaying all artists...");
						displayAllArtists();						
					} else if (selection.equals("6") ) {
						System.out.println("\tAdding an artist...");
						addNewArtist();		
					} else if (selection.equals("7") ) {
						System.out.println("\tDeleting an artist...");
						deleteArtist();		
					} else if (selection.equals("8") ) {
						System.out.println("\tUpdating an artist...");
						updateArtist();					
					} else if (selection.equals("9") ) {
						System.out.println("\tDisplaying all certifications...");
						displayAllCerts();		
					} else if (selection.equals("10") ) {
						System.out.println("\tAdding a certification...");
						addNewCert();		
					} else if (selection.equals("11") ) {
						System.out.println("\tDeleting a certification...");
						deleteCert();		
					} else if (selection.equals("12") ) {
						System.out.println("\tUpdating a certification...");
						updateCert();		
					} else {
						if (!(selection.equals("-1"))) {
								System.out.println("Invalid Option!");
						}		
					}
					
				} catch(Exception e) {
						System.out.println("Error!");
			            e.printStackTrace(); 
				}
		
			} while (!(selection.equals("-1")));
			System.out.println("\n\nEnd of program...\n\nThanks for using the " + DATABASE_NAME + " database!");
		
	}

		
	/*
	 * Method:  displayAllAlbums()
	 */
	private void displayAllAlbums() {
		/*
		 * No need for input... print all album data
		 */

		
	}
	
	/*
	 * Method:  addNewAlbum()
	 */	
	private void addNewAlbum() {
		/*
		 * prompt user for all new album data
		 */

		
	}

	/*
	 * Method:  deleteAlbum()
	 */
	private void deleteAlbum() {
		/*
		 * prompt user for album name, and confirm that they want to delete?:
		 */
	
		
	}

	/*
	 * Method:  updateAlbum()
	 */
	private void updateAlbum() {
		/*
		 * prompt user for album name, and possible input changes:
		 */
		
	}

	/*
	 * Method:  displayAllArtists()
	 */
	private void displayAllArtists() {
		/*
		 * No need for input... print all artist data
		 */

		
	}
	
	/*
	 * Method:  addNewArtist()
	 */	
	private void addNewArtist() {
		/*
		 * prompt user for all new artist data
		 */

		
	}

	/*
	 * Method:  deleteArtist()
	 */
	private void deleteArtist() {
		/*
		 * prompt user for artist name, and confirm that they want to delete?:
		 */
	
		
	}

	/*
	 * Method:  updateArtist()
	 */
	private void updateArtist() {
		/*
		 * prompt user for artist name, and possible input changes:
		 */
		
	}

	/*
	 * Method:  displayAllCerts()
	 */
	private void displayAllCerts() {
		/*
		 * No need for input... print all certification data
		 */

		
	}
	
	/*
	 * Method:  addNewCert()
	 */	
	private void addNewCert() {
		/*
		 * prompt user for all new certification data
		 */

		
	}

	/*
	 * Method:  deleteCert()
	 */
	private void deleteCert() {
		/*
		 * prompt user for certification id???, and confirm that they want to delete?:
		 */
	
		
	}

	/*
	 * Method:  updateCert()
	 */
	private void updateCert() {
		/*
		 * prompt user for certification id, and possible input changes:
		 */
		
	}
	/*
	 * Method:  printMenu()
	 */
	private void printMenu() {
		System.out.println();
		System.out.println("Please select one of the following options...\n\tAll of these requests are on the " + DATABASE_NAME + " database:\n-------------------------------------------------------");
		for (int i = 0; i<options.size(); i++) {
			if (i<9) {
				System.out.println("   "+(i+1) + ") " + options.get(i));
			} else {
				System.out.println("  "+(i+1) + ") " + options.get(i));
			}
		}		
		System.out.println("  -1) Exit Program");
		System.out.println("-------------------------------------------------------");
	}
}
