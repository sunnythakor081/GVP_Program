import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
public class Folder implements IFolder
{
	private boolean isExists(String foldername)
	{
		File folder=new File(foldername);
		return folder.exists();	
		
	}
	
	public boolean createFolder(String fname)
	{
		File newFolder=new File(fname);
		if(!isExists(fname))
		{
			if(newFolder.mkdir())
			{
					return true;
				
			}
			else
			{
				return false;
				
			}
			
			
		}
		else
		{
			
			return false;
			
		}
		
		
		
	}
	public boolean renameFolder(String oldname,String newname)
	{
		File oldFolder=new File(oldname);
		File newFolder=new File(newname);
		if(isExists(oldname))
		{
			if(oldFolder.renameTo(newFolder))
			{
				return true;
			}
			else
			{
				return false;
				
			}
			
		}
		else
		{
			return false;
			
		}
		
		
		
	}
	public boolean copyFolder(String sourceFolder, String destinationFolder)
	{
		File source = new File(sourceFolder);
        File destination = new File(destinationFolder);

        if (!isExists(sourceFolder)) {
            return false;
        }

        if (!destination.exists()) {
            destination.mkdir();
        }
		try 
		{
            Files.walk(source.toPath())
                    .forEach(sourcePath -> {
                        try {
                            Path destinationPath = destination.toPath().resolve(source.toPath().relativize(sourcePath));
                            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
                        } catch (IOException e) {
                            // Do nothing, just ignore the exception
                        }
                    });
            return true;
        }
		catch (IOException e) 
		{
            return false;
        }
		
		
		
	}
	
	
	
	public boolean deleteFolder(String folderName) {
        File folderToDelete = new File(folderName);
        if (isExists(folderName)) {
            if (folderToDelete.isDirectory()) {
                return deleteRecursive(folderToDelete);
            }
        } else {
            return false;
        }
        return false;
    }
	
	private boolean deleteRecursive(File file) {
        File[] contents = file.listFiles();
        if (contents != null) {
            for (File f : contents) {
                if (!deleteRecursive(f)) {
                    return false;
                }
            }
        }
        return file.delete();
    }
	



}

