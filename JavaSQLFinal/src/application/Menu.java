package application;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import dao.AlbumDao;
import dao.ArtistDao;
import entity.Artist;

public class Menu {
    
		private AlbumDao albumDao = new AlbumDao();
		private ArtistDao artistDao = new ArtistDao();
		private final String DATABASE_NAME = "recording_artists";
		private Scanner scanner = new Scanner(System.in);
		private List<String> options = Arrays.asList("Album Menu",
													 "Artist Menu",
													 "Certification Menu");
						
		private List<String> album_options = Arrays.asList("Display All Albums",
				 									 	   "Add A New Album", 
													       "Delete An Album",
													       "Update An Album");
		
		
		private List<String> artist_options = Arrays.asList("Display All Artists",
				 									        "Add A New Artist", 
													        "Delete An Artist",
													        "Update An Artist");
		
		
		private List<String> cert_options = Arrays.asList("Display All Certifications",
				 									      "Add A New Certification", 
													      "Delete A Certification",
													      "Update A Certification");
		
		public void start() {
			String selection = "";
			String subselection = "";
	

			do {
				System.out.println("\n\nMain " + DATABASE_NAME + " Menu\n");
				printMenu(options);
				scanner = new Scanner(System.in);
				selection = scanner.nextLine();
				
				try {
					
					if (selection.equals("1") ) {
						System.out.println("\nAlbum Information Menu\n");
						printMenu(album_options);
						scanner = new Scanner(System.in);
						subselection = scanner.nextLine();

						
						if (subselection.equals("1") ) {
							System.out.println("\tDisplaying all albums...");
							displayAllAlbums();
						} else if (subselection.equals("2") ) {
							System.out.println("\tAdding an album...");
							addNewAlbum();
						} else if (subselection.equals("3") ) {
							System.out.println("\tDeleting an album...");
							deleteAlbum();
						} else if (subselection.equals("4") ) {
							System.out.println("\tUpdating an album...");
							updateAlbum();
						} else {
							if (!(subselection.equals("-1"))) {
								System.out.println("Invalid Option!");
							}
							
						}	
						
					} else if (selection.equals("2") ) {
						
						System.out.println("Artist Information Menu\n");
						printMenu(artist_options);
						scanner = new Scanner(System.in);
						subselection = scanner.nextLine();

					    if (subselection.equals("1") ) {
					    	System.out.println("\tDisplaying all artists...");
							displayAllArtists();						
						} else if (subselection.equals("2") ) {
							System.out.println("\tAdding an artist...");
							addNewArtist();		
						} else if (subselection.equals("3") ) {
							System.out.println("\tDeleting an artist...");
							deleteArtist();		
						} else if (subselection.equals("4") ) {
							System.out.println("\tUpdating an artist...");
							updateArtist();					
						} else {
							if (!(subselection.equals("-1"))) {
								System.out.println("Invalid Option!");
							}
						}	
					
						
					} else if (selection.equals("3") ) {
						System.out.println("Certification Information Menu\n");
						printMenu(cert_options);
						scanner = new Scanner(System.in);
						subselection = scanner.nextLine();
						
						if (subselection.equals("1") ) {
							System.out.println("\tDisplaying all certifications...");
							displayAllCerts();		
						} else if (subselection.equals("2") ) {
							System.out.println("\tAdding a certification...");
							addNewCert();		
						} else if (subselection.equals("3") ) {
							System.out.println("\tDeleting a certification...");
							deleteCert();		
						} else if (subselection.equals("4") ) {
							System.out.println("\tUpdating a certification...");
							updateCert();		
						} else {
							if (!(subselection.equals("-1"))) {
									System.out.println("Invalid Option!");
							}		
						}
						

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
		
		/*
		 * ADD CODE 
		 */
		
	}
	
	/*
	 * Method:  addNewAlbum()
	 */	
	private void addNewAlbum() {
		/*
		 * prompt user for all new album data
		 */
		System.out.print("Enter Album Name: ");
		String albumName = scanner.nextLine();	
		System.out.print("Enter Artist: ");
		String artistName = scanner.nextLine();	  // Use this to find the Artist_ID by calling 
												  // artistDao.getArtistByName(artistName).getArtist_id();
		System.out.print("Enter Label: ");
		String labelName = scanner.nextLine();	
		System.out.print("Enter Genre: ");
		String genre = scanner.nextLine();	

		/*
		 * ADD CODE 
		 */
	}

	/*
	 * Method:  deleteAlbum()
	 */
	private void deleteAlbum() {
		/*
		 * prompt user for album name, and confirm that they want to delete?:
		 */
		System.out.print("Enter Name of Album to Delete: ");
		String albumName = scanner.nextLine();	
		System.out.println("Deleting Album...");

		/*
		 * ADD CODE 
		 */
		
	}

	/*
	 * Method:  updateAlbum()
	 */
	private void updateAlbum() {
		/*
		 * prompt user for album name, and possible input changes:
		 */
		System.out.print("Enter Name of Album to Update: ");
		String albumName = scanner.nextLine();	
		System.out.println("Updating Album...");

		/*
		 * ADD CODE 
		 */
	}

	/*
	 * Method:  displayAllArtists()
	 */
	private void displayAllArtists() throws SQLException {
		/*
		 * No need for input... print all artist data
		 */
		List<Artist> artists = artistDao.getArtists();
		for (Artist artist : artists) {
			System.out.println("Id: " + artist.getArtist_id() + " \tName: " + artist.getArtist_name());	
		}		
		
	}

	/*
	 * Method:  addNewArtist()
	 */	
	private void addNewArtist() throws SQLException {
		/*
		 * prompt user for all new artist data
		 */
		System.out.print("Enter New Artist: ");
		String artist_name = scanner.nextLine();
		artistDao.createNewArtist(artist_name);		
	}

	
	/*
	 * Method:  deleteArtist()
	 */
	private void deleteArtist() throws SQLException {
		/*
		 * prompt user for artist name, and confirm that they want to delete?:
		 */
		System.out.print("Enter Name of Artist to Delete: ");
		String artistName = scanner.nextLine();
		
		System.out.println("Deleting Artist...");
		Artist artist = artistDao.getArtistByName(artistName);
		if (artist == null) {
			System.out.println("Artist does not exist!");
			System.out.println("Delete Artist not performed!");
		} else {
			System.out.println("Id: " + artist.getArtist_id() + " \tName: " + artist.getArtist_name());
			System.out.println();
			System.out.print("Would you like to proceed, yes or no?  ");
			String response = scanner.nextLine();
			if (response.equalsIgnoreCase("yes")) {
				artistDao.deleteArtist(artistName);	
			} else {
				System.out.println("Delete Artist not performed!");
			}	
		}
	}

	/*
	 * Method:  updateArtist()
	 */
	private void updateArtist() throws SQLException {
		/*
		 * prompt user for artist name to change, and new artist name
		 */
		System.out.print("Enter Name of Artist to Update: ");
		String artistName = scanner.nextLine();
		System.out.println("Updating Artist...");
		Artist artist = artistDao.getArtistByName(artistName);
		System.out.println("Id: " + artist.getArtist_id() + " \tName: " + artist.getArtist_name());	
		System.out.println();
		System.out.print("Enter NEW Name of Artist to Update: ");
		String newName = scanner.nextLine();
		if (newName == null) {
			System.out.println("Update Artist not performed!");
		} else {
			artistDao.updateArtist(artistName,newName);
		}	
	}

	/*
	 * Method:  displayAllCerts()
	 */
	private void displayAllCerts() {
		/*
		 * No need for input... print all certification data
		 */

		/*
		 * ADD CODE
		 */
		
	}
	
	/*
	 * Method:  addNewCert()
	 */	
	private void addNewCert() {
		/*
		 * prompt user for album to add certification data
		 * 		check to see if that album exists (in album table) & retrieve album_id
		 * 		prompt for new data (cert_date & ???)
		 */


		/*
		 * ADD CODE
		 */

	}

	/*
	 * Method:  deleteCert()
	 */
	private void deleteCert() {
		/*
		 * prompt user for ???, and confirm that they want to delete?:
		 */
	
		/*
		 * ADD CODE
		 */

		
	}

	/*
	 * Method:  updateCert()
	 */
	private void updateCert() {
		/*
		 * prompt user for ???, and possible input changes:
		 */

		/*
		 * ADD CODE
		 */

		
	}
	/*
	 * Method:  printMenu()
	 */
	private void printMenu(List<String> options) {
		System.out.println("\tPlease select an option...\n\tAll requests are on the " + DATABASE_NAME + " database:\n------------------------------------------------------------");
		for (int i = 0; i<options.size(); i++) {
				System.out.println("   "+(i+1) + ") " + options.get(i));
			}		
		System.out.println("  -1) Exit Menu");
		System.out.println("------------------------------------------------------------");
	}
	
	
	
	
}
