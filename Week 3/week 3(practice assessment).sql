CREATE TABLE Genre (
    GenreID INT PRIMARY KEY,
    GenreName VARCHAR(100)
);
INSERT INTO Genre (GenreID, GenreName) VALUES
(1, 'Rock'),
(2, 'Pop'),
(3, 'Jazz'),
(4, 'Hip-Hop'),
(5, 'Blues'),
(6, 'Lati'),
(7, 'Metal'),
(8, 'soundtrack');
CREATE TABLE Artist (
    ArtistID INT PRIMARY KEY,
    ArtistName VARCHAR(100)
);
INSERT INTO Artist (ArtistID, ArtistName) VALUES
(1, 'The Beatles'),
(2, 'Taylor Swift'),
(3, 'John Coltrane'),
(4, 'Eminem'),
(5, 'AC/DC'),
(6, 'BackBeat'),
(7, 'Johnathon'),
(8, 'Accept');

CREATE TABLE Albums (
    AlbumID INT PRIMARY KEY,
    AlbumTitle VARCHAR(100),
    ArtistID INT,
    GenreID INT,
    FOREIGN KEY (ArtistID) REFERENCES Artist(ArtistID),
    FOREIGN KEY (GenreID) REFERENCES Genre(GenreID)
);
INSERT INTO Albums (AlbumID, AlbumTitle, ArtistID, GenreID) VALUES
(1, 'Abbey Road', 1, 1),
(2, '1989', 2, 2),
(3, 'Blue Train', 3, 3),
(4, 'The Eminem Show', 4, 4),
(5, 'abbas rehtam', 5, 5),
(6, '2020', 6, 6),
(7, 'water pasific', 7, 7),
(8, 'The diljit track', 8, 8);
CREATE TABLE Tracks (
    TrackID INT PRIMARY KEY,
    TrackTitle VARCHAR(100),
    AlbumID INT,
    FOREIGN KEY (AlbumID) REFERENCES Albums(AlbumID)
);
INSERT INTO Tracks (TrackID, TrackTitle, AlbumID) VALUES
(1, 'Come Together', 1),
(2, 'Something', 1),
(3, 'Shake It Off', 2),
(4, 'Blank Space', 2),
(5, 'Blue Train', 3),
(6, 'Locomotion', 3),
(7, 'Without Me', 4),
(8, 'Sing for the Moment', 4);
SELECT 
    A.AlbumTitle,
    COUNT(T.TrackID) AS NoOfTracks
FROM 
    Albums A
JOIN 
    Tracks T ON A.AlbumID = T.AlbumID
GROUP BY 
    A.AlbumTitle
ORDER BY 
    NoOfTracks ASC;
SELECT 
    AR.ArtistName,
    AL.AlbumTitle
FROM 
    Artist AR
JOIN 
    Albums AL ON AR.ArtistID = AL.ArtistID
WHERE 
    AR.ArtistName LIKE '%m'
ORDER BY 
    AR.ArtistName;
select *from Genre;