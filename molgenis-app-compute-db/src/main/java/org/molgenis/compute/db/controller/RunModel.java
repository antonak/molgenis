package org.molgenis.compute.db.controller;

import java.util.Date;

public class RunModel
{
	private final String name;
	private final boolean running;
    private final boolean submitting;
    private final boolean complete;
	private final String backendUrl;
	private final Date creationTime;

    public RunModel(String name, boolean running, boolean submitting, boolean complete, String backendUrl, Date creationTime)
	{
		this.name = name;
		this.running = running;
        this.submitting = submitting;
        this.complete = complete;
		this.backendUrl = backendUrl;
		this.creationTime = creationTime;
	}

	public String getName()
	{
		return name;
	}

	public boolean isRunning()
	{
		return running;
	}

    public boolean isSubmitting()
    {
        return submitting;
    }

    public boolean isComplete()
    {
        return complete;
    }

    public String getBackendUrl()
	{
		return backendUrl;
	}

	public Date getCreationTime()
	{
		return creationTime;
	}

}