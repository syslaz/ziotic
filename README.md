# Ziotic Server Framework

## Introduction & History

Ziotic is a Java-based RuneScape server framework initially developed in 2011, during the 640 client revision era. It was one of the first publicly available projects to support the then-new HD graphics. After its original release, Ziotic was lost to time until it was reuploaded by the Rune-Server community, helping preserve this early piece of RSPS history.

Today, Ziotic has been restructured to use Gradle for easier builds and more modern development workflows. While not actively developed, it remains a snapshot of innovative server features and early HD support.

## Features

- **Multi-Server Setup:** Run game, lobby, and link servers.
- **HD Graphics Support:** Cutting-edge for its time.
- **Configurable:** Adjust settings in `./data`.
- **Modern Tooling:** Uses Gradle 8+ for builds and (optionally) Docker for database management.

## Installation & Setup

### Prerequisites

- **JDK 8+**
- **Gradle 8+**
- **(Optional)** Docker for database setup

### Steps

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/syslaz/ziotic.git
   cd ziotic
   ```

2. **Build the Project:**

   ```bash
   gradle build
   ```

3. **Configure Data:**
   Place configuration files (e.g., `config.ini`, `logging.ini`) in `./data`.

4. **Database Setup (Optional):**
   In `data/database`, there is a `manage-db` Bash script. It provides a menu to initialize schemas and register players for the MySQL database.

   If you use Docker:

   ```bash
   cd data/database
   docker-compose up -d
   cd ../../
   ```

### Running the Servers

- **Link Server:**

  ```bash
  gradle :server:run --args "../data -link"
  ```

- **Game/World Server (with lobby and world handling):**

  ```bash
  gradle :server:run --args "../data -game ${WORLD_ID} dual-proto"
  ```

## Contributing

Contributions are welcome. Feel free to open issues or submit pull requests on GitHub.

## License

Ziotic is distributed under the MIT License. See `LICENSE.txt` for details.
