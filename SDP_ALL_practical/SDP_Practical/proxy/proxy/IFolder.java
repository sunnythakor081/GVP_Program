public interface IFolder
{
	public boolean createFolder(String fname);
	public boolean renameFolder(String oldname,String newname);
	public boolean copyFolder(String sourcepath,String destinationpath);
	public boolean deleteFolder(String fname);
}
