public class FolderProxy implements IFolder
{
	private final Folder folder;
	private final User user;
	private final String role;
	
	public FolderProxy(User user) {
        this.user = user;
		this.folder=new Folder();
        this.role = UserAuthentication.authenticate(user.getUserName(), user.getPassword());
    }

	
	public boolean isAdmin() {
        return "admin".equals(role);
    }

    public boolean isUser() {
        return "user".equals(role);
    }
	
	public boolean createFolder(String folderName) {
        if (role != null && (isAdmin() || isUser())) {
            return folder.createFolder(folderName);
        }
        return false;
    }
	public boolean copyFolder(String sourceFolder, String destinationFolder) {
        if (role != null && (isAdmin() || isUser())) {
            return folder.copyFolder(sourceFolder, destinationFolder);
        }
        return false;
    }
	public boolean renameFolder(String oldName, String newName) {
        if (isAdmin()) {
            return folder.renameFolder(oldName, newName);
        }
        return false;
    }
	public boolean deleteFolder(String folderName) {
        if (isAdmin()) {
            return folder.deleteFolder(folderName);
        }
        return false;
    }




}

